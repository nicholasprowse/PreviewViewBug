# PreviewViewBug

A minimal example showing an issue where the PreviewView extends into a nearby GLSurfaceView

The setup consists of a PreviewView, with a GLSurfaceView above it. The PreviewView is has an aspect ratio of 1, so the top and bottom of the captured images are cropped to fit in the view, in accordance with the Scale Type of FillCenter. However, if a GLSurfaceView is placed close to the PreviewView, the cropped portion of the image is displayed in the GLSurfaceView, in the same location it would be if the PreviewView was larger. Below is a screenshot demonstrating this bahaviour. The GLSurfaceView is simply rendering a red background, but half of it is obscured by the camera image, which should not be there

![screenshot](https://user-images.githubusercontent.com/17104216/184593908-af70064c-4b1c-414c-98e6-7fcc938b9710.png)
