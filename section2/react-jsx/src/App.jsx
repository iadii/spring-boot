import { useState } from 'react'
import './App.css'
import MathsFun from './problems/mathe'
import Log from './problems/logSign'
import Arr from './problems/renderingArrays'

function App() {
  const [count, setCount] = useState(0)

  const name = "Adii";
  const element = <h1>hello {name}</h1>
  return (
    <>
      {element}
      <MathsFun />
      <Arr/>
      <Log />
    </>
  )
}

export default App
