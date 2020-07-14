node {
    stage("Stage1"){ 
        echo "hello"  
    }
    stage("Stage2"){ 
        echo "hello" 
    } 
    stage("Stage3"){ 
        echo "hello" 
    }
    stage("Intentionally Failed"){
        unstable 'failed'
    } 
    stage("Timestamp"){
        echo "hello" 
    } 
} 
