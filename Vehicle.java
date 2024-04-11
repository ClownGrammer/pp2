class Vehicle {
   private String reg;
   private String make;
   private int yoM;
   private double value;

   public Vehicle(String reg, String make, int yearOfManufacture, double value) {
      this.reg = reg;
      // fill values
      this.make = make;
      this.yoM = yoM;
      this.value = value;
   }

   // write getter and setter here
   public String getReg(){
      return reg;
   }
   
   public String getMake(){
      return make;
   }
   
   public int getyoM(){
      return yoM;
   }
   
   public double getValue(){
      return value;
   }
   
   public void setValue(double set){
      value = set;
   }
   
   public int calculateAge(int currentYear) {
      // compute age here
      int result = currentYear - yoM;
      return result;
   }

   @Override
   public String toString() {
      return "Reg No: " + reg + ", Make: " + make + ", Year of Manufacture: " + yoM + ", Value: Php" + value;
   }
}