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
        stage("Stage4"){
                echo "hello"
}
        stage("Send Email to Support"){
                mail bcc: '', body: 'The job has been completed.', cc: 'support@gmail.com', from: '', replyTo: '', subject: 'Pipeline', to: 'tuubayalcin@gmail.com'
        }
}
