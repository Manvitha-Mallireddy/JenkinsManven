package com.MaxEle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFindedEle 
{
@Test
public void test1()
{
	int n=5;
	int a[]= {10,8,20,1,0};
	MaxEleFinder m=new MaxEleFinder();
	Assert.assertEquals(20, m.Find(a,n));
}
@Test
public void test2()
{
	int n=6;
	int a[]= {10,8,20,1,0,25};
	MaxEleFinder m=new MaxEleFinder();
	Assert.assertEquals(25, m.Find(a,n));
}
@Test
public void test3()
{
	int n=4;
	int a[]= {8,20,1,30};
	MaxEleFinder m=new MaxEleFinder();
	Assert.assertEquals(30, m.Find(a,n));
}
@Test
public void test4()
{
	int n=7;
	int a[]= {1,2,3,4,5,6,7};
	MaxEleFinder m=new MaxEleFinder();
	Assert.assertEquals(7, m.Find(a,n));
}
}