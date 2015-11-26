
public class MyList {
  private String producto;
  private int id, num;

   
	   public MyList(int id,String producto) {
	  this.id = id; 
	  this.producto = producto;
      }

	  public MyList(int num) {
		   this.num = num;
	 }

	@Override
		public String toString() {
		   return "MyList :: ID " + id + "Producto = " +producto;
	   }

	
   }

