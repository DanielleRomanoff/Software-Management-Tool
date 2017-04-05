package softwaremanagementtool.agile.charts;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.XYChart;

	public class BurndownAreaChart {
		public ObservableList<XYChart.Series> data = FXCollections.observableArrayList();
		public String xAxisLabel;
		public String yAxisLabel;
		public String title;
		
		public int addSeries(String name){
			data.add(new AreaChart.Series<Integer,Integer>(name, FXCollections.observableArrayList()));
	    return seriesIndx(name);
		}
		
		public void addPoint(int indx, String X, Integer Y){
			data.get(indx).getData().add(new XYChart.Data(X, Y));
		}
		private int seriesIndx(String name) {
			for  (int i=0; i<data.size(); i++) {
				if (data.get(i).getName().equals(name)) {
					return i;
				}
			}
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
			
		}
			
		
	}
	