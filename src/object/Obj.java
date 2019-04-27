package object;
import java.awt.*;
import javax.swing.*;

public class Obj extends JPanel
{
	private int zhuangtai=2;//ÈËÎï×´Ì¬
	
	//ÆÁÄ»×ø±ê
	private int x;
	private int y;
	
	public void setzhuangtai(int a)//ÉèÖÃ×´Ì¬
	{
		zhuangtai=a;
	}
	public void setxy(int m_x,int m_y)
	{
		x=m_x;
		y=m_y;
	}
	//ÈËÎïÔÚÆÁÄ»ÖĞÒÆ¶¯
	public void movex(int m_x)
	{
		x+=m_x;
	}
	public void movey(int m_y)
	{
		y+=m_y;
	}
	
	//»ñÈ¡ÈËÎïÔÚµØÍ¼ÉÏµÄ×ø±ê
	public int getx()
	{
		return x;
	}
	public int gety()
	{
		return y;
	}
	
	public Obj(int m_x,int m_y)//ÈËÎï³õÊ¼ÆÁÄ»Î»ÖÃ
	{
		x=m_x;
		y=m_y;
	}
	
	public void paint(Graphics g)
	{
		
		switch(zhuangtai)
		{
		case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/×ßÂ·/ÏòÓÒ×ß0.png"),x-15,y-68,this);break;
		case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/×ßÂ·/ÏòÓÒ×ß1.png"),x-15,y-68,this);break;
		case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/×ßÂ·/ÏòÓÒ×ß2.png"),x-15,y-68,this);break;
		case 3:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/×ßÂ·/ÏòÓÒ×ß3.png"),x-15,y-68,this);break;
		case 4:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/×ßÂ·/Ïò×ó×ß0.png"),x-76,y-68,this);break;
		case 5:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/×ßÂ·/Ïò×ó×ß1.png"),x-76,y-68,this);break;
		case 6:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/×ßÂ·/Ïò×ó×ß2.png"),x-76,y-68,this);break;
		case 7:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/×ßÂ·/Ïò×ó×ß3.png"),x-76,y-68,this);break;
		case 8:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/Õ¾Á¢/Ãæ³¯ÓÒÕ¾.gif"),x-40,y-86,this);break;
		case 9:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/Õ¾Á¢/Ãæ³¯×óÕ¾.gif"),x-24,y-86,this);break;
		case 10:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÌøÔ¾/ÏòÓÒÌø.png"),x-40,y-90,this);break;
		case 11:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÌøÔ¾/Ïò×óÌø.png"),x-25,y-90,this);break;
		case 12:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/Å¿ÏÂ/Ãæ³¯×óÅ¿ÏÂ.png"),x-106,y-40,this);break;
		case 13:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/Å¿ÏÂ/Ãæ³¯ÓÒÅ¿ÏÂ.png"),x,y-40,this);break;
		case 14:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¼¼ÄÜ/ÇáÎè·ÉÑï/×ó/0.png"),x-165,y-110,this);break;
		case 15:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¼¼ÄÜ/ÇáÎè·ÉÑï/×ó/1.png"),x-165,y-110,this);break;
		case 16:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¼¼ÄÜ/ÇáÎè·ÉÑï/×ó/2.png"),x-165,y-110,this);break;
		case 17:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¼¼ÄÜ/ÇáÎè·ÉÑï/×ó/3.png"),x-165,y-110,this);break;
		case 18:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¼¼ÄÜ/ÇáÎè·ÉÑï/×ó/4.png"),x-165,y-110,this);break;
		case 19:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¼¼ÄÜ/ÇáÎè·ÉÑï/×ó/5.png"),x-165,y-110,this);break;
		case 20:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¼¼ÄÜ/ÇáÎè·ÉÑï/×ó/6.png"),x-165,y-110,this);break;
		case 21:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¼¼ÄÜ/ÇáÎè·ÉÑï/×ó/7.png"),x-165,y-110,this);break;
		case 22:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¼¼ÄÜ/ÇáÎè·ÉÑï/×ó/8.png"),x-165,y-110,this);break;
		case 23:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¼¼ÄÜ/ÇáÎè·ÉÑï/ÓÒ/0.png"),x-115,y-110,this);break;
		case 24:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¼¼ÄÜ/ÇáÎè·ÉÑï/ÓÒ/1.png"),x-115,y-110,this);break;
		case 25:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¼¼ÄÜ/ÇáÎè·ÉÑï/ÓÒ/2.png"),x-115,y-110,this);break;
		case 26:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¼¼ÄÜ/ÇáÎè·ÉÑï/ÓÒ/3.png"),x-115,y-110,this);break;
		case 27:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¼¼ÄÜ/ÇáÎè·ÉÑï/ÓÒ/4.png"),x-115,y-110,this);break;
		case 28:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¼¼ÄÜ/ÇáÎè·ÉÑï/ÓÒ/5.png"),x-115,y-110,this);break;
		case 29:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¼¼ÄÜ/ÇáÎè·ÉÑï/ÓÒ/6.png"),x-115,y-110,this);break;
		case 30:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¼¼ÄÜ/ÇáÎè·ÉÑï/ÓÒ/7.png"),x-115,y-110,this);break;
		case 31:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/¼¼ÄÜ/ÇáÎè·ÉÑï/ÓÒ/8.png"),x-115,y-110,this);break;
		case 32:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÅÀÉş×Ó/0.png"),x-27,y-70,this);break;
		case 33:g.drawImage(Toolkit.getDefaultToolkit().getImage("./Í¼Æ¬ËØ²Ä/Ö÷½Ç/ÅÀÉş×Ó/1.png"),x-27,y-70,this);break;
		
		}
		g.drawString("ÆÁÄ»Î»ÖÃ£º"+"x="+Integer.toString(x)+"y="+Integer.toString(y),645,525);
	}
}
