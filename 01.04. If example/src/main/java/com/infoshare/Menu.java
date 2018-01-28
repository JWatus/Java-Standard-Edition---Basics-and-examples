package com.infoshare;

public class Menu {

    private int number;
    private Option myOption;

    public void updateOption() {
        switch (getNumber()) {
            case 1:
                setMyOption(Option.START);
                break;
            default:
                setMyOption(Option.END);
        }

        //ten if i powyższy switch robią dokładnie to samo
        if (getNumber() == 1) {
            setMyOption(Option.START);
        } else {
            setMyOption(Option.END);
        }
    }


    public Option getMyOption() {
        return myOption;
    }

    public void setMyOption(Option myOption) {
        this.myOption = myOption;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
