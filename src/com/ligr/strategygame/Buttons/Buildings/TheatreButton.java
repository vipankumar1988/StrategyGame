package com.ligr.strategygame.Buttons.Buildings;

import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.util.color.Color;

import com.ligr.strategygame.MainActivity;
import com.ligr.strategygame.PlaceBuilding;
import com.ligr.strategygame.buildings.House;

public class TheatreButton extends Sprite {

	private static String currentbuilding;
	private MainActivity main;
	
	public TheatreButton(float pX, float pY, ITextureRegion pTextureRegion,
			VertexBufferObjectManager pVertexBufferObjectManager,MainActivity main) {
			super(pX, pY, pTextureRegion, pVertexBufferObjectManager);
			this.setAlpha(0);
			this.main = main;
	}

	@Override
	protected void onManagedUpdate(final float pSecondsElapsed){

	}
	
	@Override
    public boolean onAreaTouched(TouchEvent pSceneTouchEvent, float pTouchAreaLocalX, float pTouchAreaLocalY) {
		if(pSceneTouchEvent.isActionUp() && this.getAlpha()!=0){
				
			main.boolplacebuilding = true;
			main.createBuildingHUD("Theatre");
			main.removeBuildingTouchAreas();
			//	main.MoreInfoText.setText("An amphittheathre provides nearby inhabitants with amusement.");
			main.MoreInfoText.setColor(Color.BLACK);
		}
		return true;
	
	}
	
	
}
