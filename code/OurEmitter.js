class OurEmitter
{
    listeners ={};
    on(event, callback)
    {
        if(!this.listeners[event])
        {
            this.listeners[event] = [];
        }
        this.listeners[event].push(callback);
    }
    emit(event,data)
    {
        let listener = this.listeners[event] || [];
        for(const list of listener)
        {
            list(data);
        }
    }
}
let emitter = new OurEmitter();
emitter.on('auth',function(data){
    console.log('Auth ',data);
})
emitter.on('auth',function(data){
    console.log('Auth 2 ',data);
})

emitter.emit('auth',{
    message : "Success"
})