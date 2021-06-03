/**
 * 
 */
package com.javamastermind.provider.domain;

/**
 * @author lahiru_w
 */

public class Pizza
{
    private String type;

    private String size;

    private String prize;

    private String flavour;

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public String getPrize()
    {
        return prize;
    }

    public void setPrize(String prize)
    {
        this.prize = prize;
    }

    public String getFlavour()
    {
        return flavour;
    }

    public void setFlavour(String flavour)
    {
        this.flavour = flavour;
    }

    @Override
    public String toString()
    {
        return "Pizza [type=" + type + ", size=" + size + ", prize=" + prize + ", flavour=" + flavour + "]";
    }

}
