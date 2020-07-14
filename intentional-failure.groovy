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
        error 'failed'
    } 
    stage("Stage5"){
        echo "hello" 
    } 
} 
