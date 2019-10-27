package com.BNU.startmain;

import java.io.IOException;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.BNU.windowbuilder.WindowBuilder;

/*
 * This is main, it will call the windowbuilder constructor that will build the JFrame
 */
public class Main 
{
    public static void main( String[] args ) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
    {
        System.out.println( "Hello World!" );
        //we need this but not THIS -> UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        try {
			WindowBuilder window = new WindowBuilder();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
