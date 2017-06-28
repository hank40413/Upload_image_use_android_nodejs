var express = require('express');
var router = express.Router();
var upload = require('../multerUtil');

/* GET home page. */
router.get('/', function(req, res){
    res.send(
        '<form action="/" method="post" enctype="multipart/form-data">'+
        '<input type="file" name="file">'+
        '<input type="submit" value="Upload">'+
        '</form>'
    );
});

router.post('/', upload.single('file'), function(req, res, next){
    res.send({ret_code: '0'});
});



module.exports = router;
