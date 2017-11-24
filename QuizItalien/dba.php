<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "flbk_rob";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "SELECT * FROM quiz";
$result = $conn->query($sql);

echo "<table>";
echo "<tr><td>Name</td><td>Points</td></tr>";
if ($result->num_rows > 0) {
    // output data of each row
    while($row = $result->fetch_assoc()) {
	echo "<tr>";
	echo "<td>" . $row["Name"] ."</td>";
	echo "<td>" . $row["Points"] . "</td>";
	echo "</tr>";
    }
} else {
    echo "0 results";
}
echo "</table>";
$conn->close();
?>