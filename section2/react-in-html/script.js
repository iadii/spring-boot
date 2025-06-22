const randomNum = Math.floor(Math.random * 100) + 1;

const numElement = React.createElement('h1', null, `Generated Number : ${randomNum}`)

const resultElement = React.createElement('div', null, 
    randomNum%2 === 0 ? "the number is even": "the number is odd"
)

const reactRoot = ReactDOM.createRoot(document.getElementById('root'))
reactRoot.render([numElement, resultElement])