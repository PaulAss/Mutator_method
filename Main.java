class Dog{
   private String name;
   private int age;

  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public void setName(String newName){
    this.name = newName;
  }
  public void setAge(int newAge){
    this.age = newAge;
  }
}
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Dog gol = new Dog();
    gol.setName("Pokie");
    gol.setAge(9);
    
    System.out.println(gol.getName());
    System.out.println(gol.getAge());
  }
}