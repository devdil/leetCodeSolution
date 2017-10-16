class Solution {
 public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		
		if (flowerbed.length < 1)
			return false;
		
		else if (flowerbed.length == 1) {
			if (flowerbed[0] == 0)
				n = n-1;
			return (n <= 0) ? true : false;
		}
		
		else {
			
			for (int i=0 ;i < flowerbed.length; i++) {
				
				if (flowerbed[i] == 0) {
					// it means i have found a empty space
					if (i == 0) {
						if ( flowerbed[i+1] == 0) {
							n = n -1;
							flowerbed[i] = 1;
						}
					}
					
					else if ( i == flowerbed.length -1) {
						if (flowerbed[i-1] == 0)
						{
							n = n -1;
							flowerbed[i] = 1;
						}
					}
					else {
						System.out.println("indexx" +i);
						if (flowerbed[i-1] == 0 && flowerbed [i+1] == 0) {
							n = n -1;
							flowerbed[i] = 1;
							continue;
						}
					}
					
				}
			}
			
			return (n <=0 ) ?  true : false;
		}
	}
}