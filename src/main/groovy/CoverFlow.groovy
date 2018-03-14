//@Grab('org.codehaus.groovyfx:groovyfx:0.4.0')

import static groovyx.javafx.GroovyFX.start

start {
    stage title: "GroovyFX Cover Flow", visible: true, {
        scene {
            view = imageView( new File('resources/img/Amilka.jpg').toURI().toURL() ) {
                onMouseClicked {
                    println "Moooooo!"
                }
            }
        }
    }
}