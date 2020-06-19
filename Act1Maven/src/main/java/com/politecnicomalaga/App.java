package com.politecnicomalaga;

import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.fraction.FractionFormat;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Fraction f1 = new Fraction(1,3);
        Fraction f2 = new Fraction(2,4);
        Fraction f3 = f1.add(f2);
        FractionFormat format = new FractionFormat();
        System.out.println(format.format(f3));

        DescriptiveStatistics stats = new DescriptiveStatistics();
        for (int i = 0; i<100; i++){
            stats.addValue((double)i);
        }
        System.out.println(stats.getMean());

    }
}
