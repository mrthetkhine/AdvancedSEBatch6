const authEvent = require('./auth-module').authEvent;
console.log('AuthEvent ',authEvent);
authEvent.on('auth',function(e){
    console.log('Authentication success ',e);
})

authEvent.emit('auth',{
    message: "Auth ok"
});
