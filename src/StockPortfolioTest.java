/*
 * File: StockPortfolio.java
 * 
 * Programmer: Daniel A. Alvarez
 */

/**
 * Represent a stock portfolio using the traditional measure
 */

import javax.swing.JOptionPane;

public class StockPortfolioTest {

    public static void main(String[] args) 
    {
        //1
        String companyName = JOptionPane.showInputDialog("Enter company name:");
        String numberOfShares = JOptionPane.showInputDialog("Enter number of shares:");
        String dollarPortion = JOptionPane.showInputDialog("Enter dollar portion of the value:");
        String eighthPortion = JOptionPane.showInputDialog("Enter eighth portion of the value:");
        
        int shares = Integer.parseInt(numberOfShares);
        int dollars = Integer.parseInt(dollarPortion);
        int eighths = Integer.parseInt(eighthPortion);
        
        //2
        StockPortfolio MyPortfolio = new StockPortfolio (companyName, shares, dollars, eighths);
        
        //3
        System.out.println("Company: " + MyPortfolio.getcompanyName());
        System.out.println("Shares Held: " + MyPortfolio.getShares());
        System.out.println("The value per share is $" + MyPortfolio.getdollarPortion() +
                " " + MyPortfolio.geteighthsPortion() + "/8");
        
        //4
        System.out.printf("Opening Portfolio Value: $%.2f%n", MyPortfolio.computePortfolioValue());
        
        //5
        String changeInDollars = JOptionPane.showInputDialog("Enter change in dollar portion of share price:");
        String changeInEighths = JOptionPane.showInputDialog("Enter change in eighths portion of share price:");
        int dollarChange = Integer.parseInt(changeInDollars);
        int eighthsChange = Integer.parseInt(changeInEighths);
        MyPortfolio.modPrice(dollarChange, eighthsChange);
        
        System.out.println("Change in price per share is $" + dollarChange + " " + eighthsChange + "/8");
        
        //6
        System.out.println("The updated value per share is $" + MyPortfolio.getdollarPortion() +
                " " + MyPortfolio.geteighthsPortion() + "/8");
        
        //7
        System.out.printf("Updated Portfolio Value: $%.2f%n", MyPortfolio.computePortfolioValue());
        
        //8
        String secondChangeInDollars = JOptionPane.showInputDialog("Enter second change in dollar portion of share price:");
        String secondChangeInEighths = JOptionPane.showInputDialog("Enter second change in eighths portion of share price:");
        dollarChange = Integer.parseInt(secondChangeInDollars);
        eighthsChange = Integer.parseInt(secondChangeInEighths);
        MyPortfolio.modPrice(dollarChange, eighthsChange);
        
        System.out.println("Change in price per share is $" + secondChangeInDollars + " " + secondChangeInEighths + "/8");
        
        //9
        System.out.println("The final value per share is $" + MyPortfolio.getdollarPortion() +
                " " + MyPortfolio.geteighthsPortion() + "/8");
        
        //10
        System.out.printf("Final Portfolio Value: $%.2f%n", MyPortfolio.computePortfolioValue());
    }
    
}
