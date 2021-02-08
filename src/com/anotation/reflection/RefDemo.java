package com.anotation.reflection;

import com.anotation.Author;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class RefDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class personClass = Person.class;

        Person person = new Person();
        Class personClass2 = person.getClass();

        Class personClass3 = Class.forName("Person");
// три варианта саздания объекта класса Class с данными класса Person
        Method[] methods = personClass.getMethods();

//        for (Method method : methods) {
//            System.out.println(method.getName() + ", " + method.getReturnType()
//                    + ", " + Arrays.toString(method.getParameterTypes()));
//        }
        //все методы обьекта класса Person помещаются(personClass.getMethods) в массив methods
        //  и выводяться через foreach

        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + ", " + field.getType());
            // здесь помещаються все переменные класса включая инкапсулированые (getDeclaredFields)
        }

        Annotation[] annotations = personClass.getAnnotations();

        for (Annotation annotation : annotations) {
        if(annotation instanceof Author){
            System.out.println("Yes");
        }
        }
    }
}
