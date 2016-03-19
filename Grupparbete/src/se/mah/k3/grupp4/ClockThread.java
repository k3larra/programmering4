package se.mah.k3.grupp4;

import java.text.DecimalFormat;
import java.util.Calendar;

//kör klockan 
	public class ClockThread extends Thread{
				
		        @Override
				public void run(){
		        	
		        	//TestGUI gui= new TestGUI(this);
		        	DecimalFormat decimalFormat = new DecimalFormat("00");
					int lastUpdate=0;
					int lastMinute=0;
						while(true) {
							
						Calendar cal = Calendar.getInstance();
						
						int second = cal.get(Calendar.SECOND);
						int minute = cal.get(Calendar.MINUTE);
						int hour = cal.get(Calendar.HOUR_OF_DAY);

						Gui2.setTimeOnLabel("" + decimalFormat.format(hour) + ":" +decimalFormat.format(minute) + ":" + decimalFormat.format(second));
						//TestGUI.setTimeOnLabel("" + decimalFormat.format(hour) + ":" +decimalFormat.format(minute) + ":" + decimalFormat.format(second));
						
//						if(second> lastUpdate+30){// || minute>lastMinute){
//							TestGUI.update();
//							lastUpdate=second;
//							lastMinute=minute;
//						}
				
						
						try {
							Thread.sleep(900);
						
					} catch (InterruptedException e) {
						e.printStackTrace();
						return;
					}
						
						
		
					}
				}
				
			}
				
	

