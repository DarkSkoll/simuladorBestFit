import java.util.Vector;

public class Virtual2Physical
{
	 public static int pageNum ( long memaddr , int numpages , long block ) {
	    int i = 0;
	    long high = 0;
	    long low = 0;

	    for (i = 0; i <= numpages; i++)
	    {
	      low = block * i;
	      high = block * ( i + 1 );
	      if ( low <= memaddr && memaddr < high )
	      {
	        return i;
	      }
	    }
	    return -1;
  	}

   //funcion para crear las segmentaciones
  public static int [] segmentacion( long memaddr , long memaddr1, int numpages , long block )
  {
    int i = 0;
    int arreglo[] = new int [3];
    long high = 0;
    long low = 0;
    int pag1 = 0;
    int pag2 = 0;

    for (i = 0; i <= numpages; i++)
    {
      low = block * i;
      high = block * ( i + 1 );
      if ( low <= memaddr && memaddr < high )
      {
        pag1 = i;
      }
      if ( low <= memaddr1 && memaddr1 < high )
      {
        pag2 = i;
      }
    }

    if((pag1 >= 0 && pag1 < 2) && (pag2 >= 0 && pag2 < 2)){
    	arreglo[0] = 1;
    	arreglo[1] = pag1;
    	arreglo[2] = pag2;
    	return arreglo;
    }else{
    	if((pag1 >= 2 && pag1 < 5) && (pag2 >= 2 && pag2 < 5)){
	    	arreglo[0] = 2;
	    	arreglo[1] = pag1;
	    	arreglo[2] = pag2;
	    	return arreglo;
    	}else{
    		if((pag1 >= 5 && pag1 < 11) && (pag2 >= 5 && pag2 < 11)){
		    	arreglo[0] = 3;
		    	arreglo[1] = pag1;
		    	arreglo[2] = pag2;
		    	return arreglo;
    		}else{
    			if((pag1 >= 11 && pag1 < 20) && (pag2 >= 11 && pag2 < 20)){
			    	arreglo[0] = 4;
			    	arreglo[1] = pag1;
			    	arreglo[2] = pag2;
			    	return arreglo;
    			}else{
    				if((pag1 >= 20 && pag1 <= 32) && (pag2 >= 5 && pag2 <= 32)){
				    	arreglo[0] = 5;
				    	arreglo[1] = pag1;
				    	arreglo[2] = pag2;
				    	return arreglo;
    				}else{
				    	arreglo[0] = 0;
				    	arreglo[1] = pag1;
				    	arreglo[2] = pag2;
				    	return arreglo;
    				}
    			}
    		}
    	}
    }
  }
}
