package Assignment2;
  //Class Rectangle
    class Rectangle {
	int length;
	int width;
    //Constructor
	Rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	//Method
	int area()
	{
		return length*width;
	}
	
     public static void main(String args[])
     {
    	 //Object Creation
    	 Rectangle rec1=new Rectangle(10,20);
    	 Rectangle rec2=new Rectangle(20,30);
    	 int Output1 = rec1.area();
         int Output2 = rec2.area();
         //Comparing the Output
         if(Output1>Output2)
         {
        	 System.out.println("Rectangle1>Rectangle2");
         }
         else if(Output1<Output2)
         {
        	 System.out.println("Rectangle1<Rectangle2");
         }
         else
         {
        	 System.out.println("They are equal");
         }
     }
}
