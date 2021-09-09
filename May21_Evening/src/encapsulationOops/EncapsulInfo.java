package encapsulationOops;

public class EncapsulInfo {
      String  name;
      String id;
      int age;
      
      public String getName() {
    	  return name;
      }
      public String getId() {
    	  return id;
      }
      public int getAge() {
    	  return age;
      }
      public void setName(String name) {
    	  this.name=name;
      }
      public void setId(String id) {
    	  this.id=id;
      }
      public void setAge(int age) {
    	  this.age=age;
      }
//      public static void main(String[] args) {
//    		EncapsulInfo x=new EncapsulInfo();
//    		x.setName("sukhada");
//    		x.setId("sukh@26");
//    		x.setAge(26);
//    		String s=x.getName();
//    		String h=x.getId();
//    		int p=x.getAge();
//    		System.out.println("Name:"+s+"\n"+"Id:"+h+"\n"+"Age:"+p);
//    	}
}
