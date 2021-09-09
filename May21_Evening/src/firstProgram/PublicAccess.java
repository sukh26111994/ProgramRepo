//public accessible to everywhere in project.
//method,class be public which have widest scope.
package firstProgram;

public class PublicAccess {
   public void object() {
	   System.out.println("object is everywhere in java");
   }
   public static void main(String[] args) {
	PublicAccess x=new PublicAccess();
	x.object();
}
}
