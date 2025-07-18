package com.turing.advancedse6.builder;

public class Text {
    String displayValue;
    String font;
    String color;
    String decoration;

    private Text(Builder builder) {
        this.displayValue = builder.displayValue;
        this.font = builder.font;
        this.color  = builder.color;
        this.decoration = builder.decoration;
    }
    
    static class Builder
    {
        String displayValue;
        String font;
        String color;                                                           
        String decoration;
        
        Builder displayValue(String dValue)
        {
            this.displayValue = dValue;
            return this;
        }
        Builder font(String fontName)
        {
            this.font = fontName;
            return this;
        }
        Builder color(String color)
        {
            this.color = color;
            return this;
        }
        Builder decoration(String decor)
        {
            this.decoration = decor;
            return this;
        }
        Text build()
        {
            Text text = new Text(this);
            return text;
        }
    }

    @Override
    public String toString() {
        return "Text{" + "displayValue=" + displayValue + ", font=" + font 
                + ", color=" + color + ", decoration=" + decoration + '}';
    }
     public static void main(String[] args) {
        Text text = new Text.Builder()
        		  			.decoration("bold")
        		  			.font("Thoma")	
        					.displayValue("Hello")    
                            //.color("green")
                            .build();
        System.out.println("Text "+text);
        
    }
}
