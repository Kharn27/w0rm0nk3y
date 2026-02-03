package fr.w0rm0nk3y.jmestarter.android;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

public class GameApp extends SimpleApplication {

  @Override
  public void simpleInitApp() {
    Box box = new Box(1f, 1f, 1f);
    Geometry geom = new Geometry("StarterBox", box);
    Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
    mat.setColor("Color", ColorRGBA.Cyan);
    geom.setMaterial(mat);
    rootNode.attachChild(geom);

    flyCam.setMoveSpeed(10f);
    cam.setLocation(cam.getLocation().add(0f, 0f, 6f));
    cam.lookAt(geom.getWorldTranslation(), cam.getUp());
  }
}
