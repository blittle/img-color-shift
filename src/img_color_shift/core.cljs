(ns img-color-shift.core)

(defn onImageLoad ([] 
    (this-as this
        (drawImage this (canvas-context 
            (.-width this) 
            (.-height this))))))

(defn drawImage ([image, context] 
    (.drawImage context image 0 0)))

(defn loadImage ([url] ( 
    let [imgr (js/Image.)]
    (set! (.-onload imgr) onImageLoad)
    (set! (.-src imgr) url)
    imgr)))

(defn canvas-context ([width, height] 
    (.getContext 
        (create-canvas width height) "2d")))

(defn create-canvas ([width, height] (
    let [canvas (js/document.createElement "canvas")]
    (set! (.-width canvas) width)
    (set! (.-height canvas) height)
    (.appendChild js/document.body canvas)
    canvas)))

(defn ^:export buildImage [url]  
    (loadImage url))

(buildImage "http://apod.nasa.gov/apod/image/1408/Supermoon_20140810.JPG")