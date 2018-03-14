//@Grab('org.codehaus.groovyfx:groovyfx:0.4.0')

import static groovyx.javafx.GroovyFX.start

start {
    def imageUrls = new File("resources/img").listFiles().grep { it.name.endsWith('.jpg') }*.toURI()*.toURL()
    int index = 0;
    stage title: "GroovyFX Cover Flow", visible: true, {
        scene {
            view = imageView(imageUrls[index]) {
                onMouseClicked {
                    view.image = image(imageUrls[++index % imageUrls.size()])
                }
            }
        }
    }
}