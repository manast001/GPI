import java.util.*;

public class Postulante {
	/*
	 * Variable Privadas
	 */
	private float x,y;
	private List<Integer> respuestas;
	private List<Integer> xyrespuestas;
	private String rol;
	private List<List<String>> data;
	/*
	 * Constructor
	 */
	public Postulante()
	{
		this.respuestas=new ArrayList<Integer>();
		
		this.x=this.y=0;
	}
	
	/*
	 * Metodos Publicos
	 */
	public void setData(List<List<String>> data)
	{
		this.data=data;
	}
	
	public void addAnswerByIndex(Integer answer,int index)
	{
			this.respuestas.set(index, answer);
	}
	
	public void insert(int elements)
	{
		for(int i=0;i<elements;i++)
		{
			this.respuestas.add(new Integer(0));
		}
	}

	public void caculateXY()
	{
		for(int i=0;i<this.respuestas.size();i++)
		{
			if(this.respuestas.get(i)==0)
			{
				this.x++;
			}else{
				this.y++;
			}
		}
		
		this.x=(this.x/this.respuestas.size())*100;
		this.y=(this.y/this.respuestas.size())*100;
		
		this.xyrespuestas=this.respuestas;
		this.respuestas.clear();
	}
	
	public int getX(){return (int)this.x;}
	
	public int getY(){return (int)this.y;}
	
	public List<Integer> getResponse(){return respuestas;}
	
	public void setRol(String rol){this.rol=rol;}
	
	public String getRol(){return this.rol;}
	
	public int getAge(){return Integer.parseInt(data.get(0).get(7));}
}
