package com.cg.Service;


import com.cg.Entities.Placement;

public interface PlacementService 
{
	Placement addPlacement(Placement placement);
	Placement updatePlacement(Placement placement);
	Placement searchPlacement(long id);
	boolean   cancelPlacement(long id);
}
