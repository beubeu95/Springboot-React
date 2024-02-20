import {useEffect, useState} from 'react';
import axios from "axios";
const Test= () => {
    const [hello, setHello] = useState('');

    useEffect(() => {
        axios.get('/api/test')
            .then((res) => {
                setHello(res.data);
            })
    }, []);
    return (
        <div>
            {hello}
        </div>
    );
};

export default Test;