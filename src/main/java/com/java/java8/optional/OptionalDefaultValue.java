package com.java.java8.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalDefaultValue {
    public static void main(String[] args) {
        String actualDBValue=null;
        Optional<String> optionalDB=Optional.ofNullable(actualDBValue);
        String currentValue=optionalDB.orElse("Default value");
        System.out.println(optionalDB);
        System.out.println(currentValue );

        Supplier<String> stringSupplier=()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Fetching data from External APIs");
            return "String value fetched from external API";
        };
        String valueAfterFetching=optionalDB.orElseGet(stringSupplier);
        System.out.println(valueAfterFetching);

        //To throw Exception when data is not found using Supplier
//        Supplier throwExceptionSupplier=()->{
//            throw new RuntimeException("Data is not found in DB!!");
//        };
//        String exceptionMsg= optionalDB.orElseThrow(throwExceptionSupplier);
//        System.out.println(exceptionMsg);

        //To throw Custom Exception using Supplier
        Supplier throwCustomExceptionSupplier=()->{
            throw new ResourceNotFoundException("Data is not found in DB!!");
        };
        String customExceptionMsg= optionalDB.orElseThrow(throwCustomExceptionSupplier);
        System.out.println(customExceptionMsg);
    }
}
class ResourceNotFoundException extends RuntimeException
{
    public ResourceNotFoundException(String message)
    {
        super(message);
    }
}