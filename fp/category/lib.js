    let Left = (value)=>({
        value,
        map(fn)
        {
            return Left.of(value); 
        },
        matchWith(context)
        {
            return context.left(value);
        },
        valueOf()
        {
            return value;
        }
    });
    Left.of = Left;
    let Right = (value)=>({
        value,
        map(fn)
        {
            return Right.of(fn(value)); 
        },
        matchWith(context)
        {
            return context.right(value);
        },
        valueOf()
        {
            return value;
        }
    });
    Right.of = Right;