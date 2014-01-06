import java.util.ArrayList;
import java.util.List;


public class Cargo {
	private List<List<Integer>> estrategico,tactico,operacional;
	private List<Integer> cestrategico,ctactico,coperacional;
	
	public Cargo()
	{
		this.estrategico=new ArrayList<List<Integer>>();
		this.tactico=new ArrayList<List<Integer>>();
		this.estrategico=new ArrayList<List<Integer>>();
		
		this.cestrategico=new ArrayList<Integer>();
		this.ctactico=new ArrayList<Integer>();
		this.coperacional=new ArrayList<Integer>();
	}
	
	public void addNewStrategic(List<Integer> lista,int coincidencia)
	{
		this.estrategico.add(lista);
		this.cestrategico.add(coincidencia);
	}
	
	public void addNewTactic(List<Integer> lista,int coincidencia)
	{
		this.tactico.add(lista);
		this.ctactico.add(coincidencia);
	}
	
	public void addNewOperational(List<Integer> lista,int coincidencia)
	{
		this.operacional.add(lista);
		this.coperacional.add(coincidencia);
	}
	
	
	
}
