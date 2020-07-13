node {
	stage("Stage1"){
		echo "hello"
}
	stage("Stage2"){
		timestamps {
            echo "hello"
        }
    }
	stage("Stage3"){
		timestamps {
            echo "hello"
        }
    }
	stage("Stage4"){
		timestamps {
            echo "hello"
        }
    }
	stage("Timestamp"){
		timestamps {
			echo "hello"
		}
	}
}
