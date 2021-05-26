/*
 * File: StockPortfolio.java
 * 
 * Programmer: Daniel A. Alvarez
 */

/**
 * Represent a stock portfolio using the traditional measure
 */
public class StockPortfolio 
{
    private String company;
    private int shares;
    private int dollarPortionPrice;
    private int eighthPortionPrice;
    
    public StockPortfolio (String name, int shares, int dollarPortion, int eighthPortion)
    {
        company = name;
        this.shares = shares;
        this.dollarPortionPrice = dollarPortion + eighthPortion / 8;
        this.eighthPortionPrice = eighthPortion % 8;
    }
    //1
    public String getcompanyName()
    {
        return company;
    }
    
    public int getShares()
    {
        return shares;
    }
    
    public int getdollarPortion()
    {
        return dollarPortionPrice;
    }
    
    public int geteighthsPortion()
    {
        return eighthPortionPrice;
    }
    //2
    public void modPrice(int changeDollarPortion, int changeEighthPortion)
    {
        dollarPortionPrice = dollarPortionPrice + changeDollarPortion +
                (eighthPortionPrice + changeEighthPortion) / 8;
        
        eighthPortionPrice = (eighthPortionPrice + changeEighthPortion) % 8;     
    }
    //3
    public double computePortfolioValue()
    {
        return shares * dollarPortionPrice + shares * eighthPortionPrice * 0.125;
    }
}
