
  const items = ["apple", "macbook", "air"];
  const element = (
    <ul>
      {items.map((item) => (
        <li key={item}> {item}</li>
      ))}
    </ul>
  );


export default element;