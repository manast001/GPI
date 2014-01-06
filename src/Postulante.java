import java.util.*;

public class Postulante {
	/*
	 * Variable Privadas
	 */
	private float x,y;
	private List<Integer> respuestas;
	public String rol;
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
	}
	
	public int getX()
	{
		return (int)this.x;
	}
	
	public int getY()
	{
		return (int)this.y;
	}
	
	public String toString()
	{
		return respuestas.toString();
		
	}
}
