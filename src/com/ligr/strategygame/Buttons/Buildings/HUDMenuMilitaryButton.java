package com.ligr.strategygame.Buttons.Buildings;

import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.util.color.Color;

import com.ligr.strategygame.MainActivity;
import com.ligr.strategygame.PlaceBuilding;
import com.ligr.strategygame.buildings.House;

public class HUDMenuMilitaryButton extends Sprite {

	private static String currentbuilding;
	private MainActivity main;
	public HUDMenuMilitaryButton(float pX, float pY, ITextureRegion pTextureRegion,
			VertexBufferObjectManager pVertexBufferObjectManager, MainActivity main) {
		super(pX, pY, pTextureRegion, pVertexBufferObjectManager);
		this.main = main;
	}

	@Override
	protected void onManagedUpdate(final float pSecondsElapsed){
		if(thisMenu())
			this.setAlpha(0.5f);
		else
			this.setAlpha(1);
	}
	
	@Override
    public boolean onAreaTouched(TouchEvent pSceneTouchEvent, float pTouchAreaLocalX, float pTouchAreaLocalY) {
		
		if(pSceneTouchEvent.isActionUp() && this.getAlpha()!=0){
				
			main.setCurrentMenu("militarybuildings");
			// Set the image of our placebuilding to the House image
			main.makeToast("This menu contains military buildings");
			main.MoreInfoText.setColor(Color.BLACK);
			main.unRegisterBuildingButtons();
			main.menuhudmilitary();
		}
		return true;
	
	}
	private boolean thisMenu() {
		return main.getCurrentMenu().equals("militarybuildings");
	}
	
}
