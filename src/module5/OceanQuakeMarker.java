package module5;

import java.security.acl.LastOwnerException;
import java.util.List;
import java.util.ArrayList;

import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.utils.ScreenPosition;
import processing.core.PGraphics;

/** Implements a visual marker for ocean earthquakes on an earthquake map
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * @author Your name here
 *
 */
public class OceanQuakeMarker extends EarthquakeMarker {
	
	public OceanQuakeMarker(PointFeature quake) {
		super(quake);
		
		// setting field in earthquake marker
		isOnLand = false;
	}
	

	/** Draw the earthquake as a square */
	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		pg.rect(x-radius, y-radius, 2*radius, 2*radius);
		pg.pushStyle();
		List <ScreenPosition> cities = getCities();
		if(cities == null) return;
		if(getClicked()) {
			pg.stroke(0,0,0);
//			setClicked(false);
//		}
//		else pg.noStroke();
		
		for(ScreenPosition sp: cities) {
			pg.line(x, y, sp.x , sp.y);
		}
		}
		pg.popStyle();
		
	}

}
