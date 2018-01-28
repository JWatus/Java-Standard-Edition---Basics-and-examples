package com.infoshare;

import com.infoshare.Calculations.*;
import com.infoshare.Conversion.*;

public class Main {
    public static void main(String[] args) {

        Conversion kon = new Conversion();
        kon.translate();

        Figure fig = new Figure();
        fig.run();

    }

}
