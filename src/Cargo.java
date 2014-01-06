import java.util.ArrayList;
import java.util.List;


public class Cargo {
	private List<List<Integer>> estrategico,tactico,operacional;
	private List<Integer> cestrategico,ctactico,coperacional;
	private List<String> sestrategico,stactico,soperacional;
	
	public Cargo()
	{
		this.estrategico=new ArrayList<List<Integer>>();
		this.tactico=new ArrayList<List<Integer>>();
		this.estrategico=new ArrayList<List<Integer>>();
		
		this.cestrategico=new ArrayList<Integer>();
		this.ctactico=new ArrayList<Integer>();
		this.coperacional=new ArrayList<Integer>();
		
		this.sestrategico=new ArrayList<String>();
		this.stactico=new ArrayList<String>();
		this.soperacional=new ArrayList<String>();
	}
	
	public void addNewStrategic(List<Integer> lista,int coincidencia,String cargo)
	{
		this.estrategico.add(lista);
		this.cestrategico.add(coincidencia);
		this.sestrategico.add(cargo);
	}
	
	public void addNewTactic(List<Integer> lista,int coincidencia,String cargo)
	{
		this.tactico.add(lista);
		this.ctactico.add(coincidencia);
		this.stactico.add(cargo);
	}
	
	public void addNewOperational(List<Integer> lista,int coincidencia,String cargo)
	{
		this.operacional.add(lista);
		this.coperacional.add(coincidencia);
		this.soperacional.add(cargo);
	}
	
	public List<String> comparate(List<Integer> postulante,String rol)
	{
		List<String> result=new ArrayList<String>();
		List<Integer> result;
		
		switch(rol)
		{
		
		case "Estrategico":
			for(int i=0;i<this.estrategico.size();i++)
			{
				
				for(int j=0;j<)
			}
			break;
		
		case "Tactico":
			for(int i=0;i<this.tactico.size();i++)
			{
				
			}
			break;
		
		case "Operacional":
			for(int i=0;i<this.operacional.size();i++)
			{
				
			}
			break;
		}
		
		return result;
	}
	
}
