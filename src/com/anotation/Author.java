package com.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
// аннотация Target ограничивает остальные аннотации.
// в скобках после Target указывается ввиде константы элемент на который
// распростроняется аннотация. В данном случае аннотация применима только к
// методам
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    String author() default "Oleghon";
    int dateOfCreation() default 2021;

}
