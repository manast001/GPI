import java.util.ArrayList;
import java.util.List;


public class Cargo {
	private List<List<Integer>> estrategico,tactico,operacional;
	private List<Double> cestrategico,ctactico,coperacional;
	private List<String> sestrategico,stactico,soperacional;
	
	public Cargo()
	{
		this.estrategico=new ArrayList<List<Integer>>();
		this.tactico=new ArrayList<List<Integer>>();
		this.operacional=new ArrayList<List<Integer>>();
		
		this.cestrategico=new ArrayList<Double>();
		this.ctactico=new ArrayList<Double>();
		this.coperacional=new ArrayList<Double>();
		
		this.sestrategico=new ArrayList<String>();
		this.stactico=new ArrayList<String>();
		this.soperacional=new ArrayList<String>();
	}
	
	public void addNewStrategic(List<Integer> lista,double coincidencia,String cargo)
	{
		this.estrategico.add(lista);
		this.cestrategico.add(coincidencia);
		this.sestrategico.add(cargo);
		
	}
	
	public void addNewTactic(List<Integer> lista,double coincidencia,String cargo)
	{
		this.tactico.add(lista);
		this.ctactico.add(coincidencia);
		this.stactico.add(cargo);
	}
	
	public void addNewOperational(List<Integer> lista,double coincidencia,String cargo)
	{
		this.operacional.add(lista);
		this.coperacional.add(coincidencia);
		this.soperacional.add(cargo);
	}
	
	public List<String> comparate(List<Integer> postulante,String rol)
	{
		List<String> result=new ArrayList<String>();
		List<Integer> resultado;
		
		double coincidencia=0;
		
		switch(rol)
		{
		
		case "Estrategico":
			for(int i=0;i<this.estrategico.size();i++)
			{
				resultado=this.estrategico.get(i);
				for(int j=0;j<resultado.size();j++)
				{
					if(postulante.get(resultado.get(j))==1)	
					{
						coincidencia++;
					}
				}
				coincidencia= (coincidencia/this.estrategico.size())*100;
				
				if(coincidencia==this.cestrategico.get(i))
				{
					result.add(this.sestrategico.get(i));
				}
			} 
			break;
		
		case "Tactico":
			for(int i=0;i<this.tactico.size();i++)
			{
				resultado=this.tactico.get(i);
				for(int j=0;j<resultado.size();j++)
				{
					if(postulante.get(resultado.get(j))==1)	
					{
						coincidencia++;
					}
				}
				coincidencia= (coincidencia/this.tactico.size())*100;
				
				if(coincidencia==this.ctactico.get(i))
				{
					result.add(this.stactico.get(i));
				}
			}
			break;
		
		case "Operacional":
			for(int i=0;i<this.operacional.size();i++)
			{
				resultado=this.operacional.get(i);
				for(int j=0;j<resultado.size();j++)
				{
					if(postulante.get(resultado.get(j))==1)	
					{
						coincidencia++;
					}
				}
				coincidencia= (coincidencia/this.operacional.size())*100;
				
				if(coincidencia==this.coperacional.get(i))
				{
					result.add(this.soperacional.get(i));
				}
			}
			break;
		}
		
		if(result.size()==0)
		{
			result=null;
		}
		
		return result;
	}
	
}
