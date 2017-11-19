package com.task.chapter4.task7;

public enum Color {

    BLACK("Black"), RED("Red"), BLUE("Blue"), GREEN("Green"), CYAN("Cyan"), MAGENTA("Magenta"),
    YELLOW("Yellow"), WHITE("White");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public Color getGreen(){
        return Color.GREEN;
    }

    public Color getRed(){
        return Color.RED;
    }
    public Color getBlue(){
        return Color.BLUE;
    }

//    getGreen, getBlue.
}

