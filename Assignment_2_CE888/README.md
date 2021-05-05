
The purpose of this repo is to demonstrate a fire detection neural net model. 

You can download the datset from this given link :- https://drive.google.com/drive/folders/1NaztX3hL6RpfQ4IQ452Ps4b-zxfeFkXO?usp=sharing

Required Libraries :- 

os, re, cv2, copy, tqdm, scipy, pickle, numpy, random, itertools, Keras 2.4.0, scikit-image, Tensorflow 2.3.0, matplotlib.pyplot.


Ideas:-

Preprocessing images, e.g. to remove background or apply filters
Classifying short sequences of video, since the movement of fire is quite characteristic
Simulated data, identify any software which can generate realistic fires and add to existing datasets
Augmentations to simulate effect of different cameras and exposure settings
Identify any relevant guidance/legislation on required accuracy of fire detection techniques

Approach & Tooling :-

Frames will be fed through neural net. On positive detection of fire metrics are extracted. Ignore smoke for MVP. Try various architectures & parameters to establish a 'good' baseline model.
Develop a lower accuracy but fast model targeted at RPi and mobile, and a high accuracy model targeted at GPU devices like Jetson. 
Yolo present both options, yolo4 lite for mobile and yolo for GPU. Alternatively there is mobilenet and tf-object-detection-api. Higher accuracy GPU model is priority.

Code :-

This code is run and tested on Python 3.8 on Windows10 machine with no issues. There is a config.py file in this directoy which shows all the configuration parameters such as Mode, image target size, Epochs, batch size, train_validation ratio, etc. All dependency files are available in the root directory of this repository.


Model:- 

The binary fire classifcation model of this project is based on the Xception Network and the fire segmentation model of this project is based on the U-NET.
