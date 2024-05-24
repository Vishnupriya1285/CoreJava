package com.java.realtimeprojects.collections.model;

import java.util.ArrayList;
import java.util.List;

public class ProductAppWithArrayList {
    private List<Product> menuList;
    public ProductAppWithArrayList()
    {

    }
    //Add a Menu Item
    public List<Product> addMenuItem(Product menu)
    {
        if(this.menuList==null)
            menuList=new ArrayList<>();
        menuList.add(menu);
        return this.menuList;
    }

    //Delete a Menu Item by Index
    public Product deleteMenuItem(int index)
    {
        if(this.menuList==null) {
            System.out.println("The Menu is empty!!!");
            return null;
        }
        Product removedItem=this.menuList.remove(index);
        return removedItem;
    }
    //Delete a Menu Item by Object
    public boolean deleteMenuItem(Product menu)
    {
        if(this.menuList==null){
            System.out.println("The Menu is empty!!");
            return false;
        }
        boolean isRemoved=menuList.remove(menu);
        return isRemoved;
    }

    //Display Menu Items
    public void displayMenu()
    {
        if(this.menuList!=null&& !menuList.isEmpty())
        {
            System.out.println("The Menu List is::");
            for(Product menuItem:menuList)
                System.out.println(menuItem);
        }
    }

    //Update Menu Item by Index
    public void updateMenuItemByIndex(int index,Product menuItem)
    {
        if(this.menuList==null) {
            System.out.println("The Menu is empty!!");
            return;
        }
        if(index<=(this.menuList.size()-1))
           this.menuList.set(index,menuItem);
    }
    //Update Menu Item by Object
    public void updateMenuItemById(int itemId,Product menuItem)
    {
        if(this.menuList==null) {
            System.out.println("The Menu is Empty!!!");
            return;

        }
        for(int index=0;index<this.menuList.size();index++)
        {
            if(this.menuList.get(index).getItemId()==itemId) {
                this.menuList.set(index, menuItem);
                break;
            }
        }
    }
}
class ProductAppExecuter
{
    public static void main(String[] args) {
        ProductAppWithArrayList menu=new ProductAppWithArrayList();

        List<Product> menuItems=MenuUtility.getMenuItems();
        for(Product item:menuItems)
           menu.addMenuItem(item);

        menu.displayMenu();
        //System.out.println("The deleted item is::"+menu.deleteMenuItem(1));
        //System.out.println(menu.deleteMenuItem(menuItems.get(0)));
        //menu.updateMenuItemByIndex(1,new Menu(104,"Spicy Chicken Sandwich",6.29));
        menu.updateMenuItemById(102,new Product(104,"Spicy Chicken Sandwich",6.29));
        menu.displayMenu();

    }
}
class MenuUtility
{
    public static List<Product> getMenuItems()
    {
        List<Product> menuItems=new ArrayList<>();
        menuItems.add(new Product(101,"Chicken Nuggets",5.99));
        menuItems.add(new Product(102,"Chicken Burger",4.99));
        menuItems.add(new Product(103,"French Fries",6.99));
        return menuItems;
    }
}