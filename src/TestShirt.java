
public class TestShirt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shirt s = new Shirt(10,10);
		s.SetCollarSize(20);
		s.SetShirtMaterial("cotton");
		s.SetSleeveLength(15);
		
	}

}

class Shirt
{
	private int collar_size, sleeve_length;
	String shirt_material;
	
	public Shirt()
	{
		this.shirt_material = "Cotton";
	}
	
	public Shirt(int collar_size,int sleeve_length )
	{
		this.collar_size = collar_size;
		this.sleeve_length = sleeve_length;
	}
	//mutator methods
	public void SetCollarSize(int c_size)
	{
		collar_size = c_size;
	}
	
	public void SetSleeveLength(int s_length)
	{
		sleeve_length = s_length;
	}
	
	public void SetShirtMaterial(String s_material)
	{
		shirt_material = s_material;
	}
	
	//accessor methods
	public int GetCollarSize()
	{
		return collar_size;
	}
	
	public int GetSleeveLength()
	{
		return sleeve_length;
	}
	
	public String GetShirtMaterial()
	{
		return shirt_material;
	}
	
	
}